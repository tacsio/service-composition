using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Net;

using System.IO;
using System.Xml.Linq;

namespace PromoTweet.Twitter
{
    public class TwitterSearch
    {
        const string TWITTER_SEARCH_URL = "http://search.twitter.com/search.atom?rpp={0}&q={1}";
        const int NUM_TWITTER = 100;

        public TwitterSearch()
        {
            //default constructor
        }

        public List<TwitterEntry> BuscaEntradaTwitter(string search)
        {
            List<TwitterEntry> retorno = new List<TwitterEntry>();

            string searchText = HttpUtility.UrlEncode(search.Trim());
            Uri twitterSearchUri = new Uri(string.Format(TWITTER_SEARCH_URL, NUM_TWITTER, search), UriKind.Absolute);
            

            //Send Twitter search request
            WebRequest request = WebRequest.Create(twitterSearchUri);
            request.Method = "GET";

            WebResponse response = request.GetResponse();

            Stream stream = response.GetResponseStream();
            XElement xmlElement = XElement.Load(stream);
            XNamespace namespaceAtom = "http://www.w3.org/2005/Atom";

            List<TwitterEntry> searchResult = (from entry in xmlElement.Descendants(namespaceAtom + "entry")
                                               select new TwitterEntry()
                                               {
                                                   Tweet = entry.Element(namespaceAtom + "title").Value,
                                                   Author = entry.Element(namespaceAtom + "author").Elements(namespaceAtom + "name").FirstOrDefault().Value,
                                                   Uri = entry.Element(namespaceAtom + "author").Elements(namespaceAtom + "uri").FirstOrDefault().Value,
                                                   Avatar = (from imgAvatar in entry.Elements(namespaceAtom + "link")
                                                             where imgAvatar.Attribute("rel") != null
                                                             && imgAvatar.Attribute("rel").Value.Contains("image")
                                                             && imgAvatar.Attribute("href") != null
                                                             select imgAvatar.Attribute("href").Value
                                                                 ).FirstOrDefault()
                                               }).ToList();
            //stream close
            stream.Close();

            retorno.Clear();
            searchResult.ForEach(item => retorno.Add(item));       

            return retorno;
        }
    }
}
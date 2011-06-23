using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace PromoTweet.Twitter
{
    public class TwitterEntry
    {
        public string Tweet { get; set; }
        public string Author { get; set; }
        public string Uri { get; set; }
        public string Avatar { get; set; }
        public int Count { get; set; }
        public int Classe { get; set; }
    }
}
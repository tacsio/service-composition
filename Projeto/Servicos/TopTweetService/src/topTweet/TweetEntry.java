package topTweet;

public class TweetEntry {

	private String author;
	private String uri;
	private String avatar;
	private String tweet;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	
	@Override
	public String toString() {
		return	"TWEET - " + this.getTweet() + "\n" + 	
				"AVATAR - " + this.getAvatar() + "\n" +
				"AUTHOR - " + this.getAuthor() + "\n" +
				"URI - " + this.getUri() + "\n";
	}
	
}

package classificarTweet;

public class TweetEntry {

	private String author;
	private String uri;
	private String avatar;
	private String tweet;
	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	public String getTweet() {
		return tweet;
	}
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
	
	@Override
	public String toString() {
		return	"TWEET - " + this.getTweet() + "\n" + 	
				"AVATAR - " + this.getAvatar() + "\n" +
				"AUTHOR - " + this.getAuthor() + "\n" +
				"URI - " + this.getUri() + "\n" +
				"COUNT - " + this.getCount() + "\n";
	}
	
}

/**
 * 
 */
package de.fzi.continuouscloudmigration.experiments;

import twitter4j.AccountTotals;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * @author mugglmenzel
 * 
 */
public class TwitterTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Twitter twitter = new TwitterFactory().getInstance();
			System.out.println("authorized?"
					+ twitter.getAuthorization().isEnabled());
			AccountTotals totals = twitter.getAccountTotals();
			System.out.println("Updates: " + totals.getUpdates());
			System.out.println("Followers: " + totals.getFollowers());
			System.out.println("Favorites: " + totals.getFavorites());
			System.out.println("Friends: " + totals.getFriends());
			// DirectMessage message =
			// twitter.sendDirectMessage("CumulusGenius",
			// "Hi Michael, this is CumulusGenius!");
			// System.out.println("Sent: " + message.getText() + " to @"
			// + message.getRecipientScreenName());
			Status status = twitter
					.updateStatus("Event: @mugglmenzel, please reconsider your Cloud service choice for component X!");
			System.out.println("twittered: " + status.getText());

		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

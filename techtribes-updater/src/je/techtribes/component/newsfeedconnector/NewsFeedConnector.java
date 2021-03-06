package je.techtribes.component.newsfeedconnector;

import com.structurizr.annotation.Component;
import je.techtribes.domain.NewsFeed;
import je.techtribes.domain.NewsFeedEntry;

import java.util.List;

@Component(description = "Retrieves news feed entries from RSS and Atom feeds.")
public interface NewsFeedConnector {

    List<NewsFeedEntry> loadNewsFeedEntries(NewsFeed feed);

}

package behavior;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromURL;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;

import java.util.List;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

public class AllStories extends JUnitStories {
	public AllStories() {
		// configure as TraderStory except for
		Configuration configuration = new MostUsefulConfiguration()
				.useStoryLoader(new LoadFromURL());
	}

	@Override
	protected List<String> storyPaths() {
//		String codeLocation = codeLocationFromClass(this.getClass()).;
		String codeLocation="";
		return new StoryFinder().findPaths(codeLocation, asList("**/*.feature"),
				asList(""), "file:"+codeLocation);
	}
}

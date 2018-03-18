package behavior;

import behavior.config.BehaviorTestConfiguration;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.UnderscoredCamelCaseResolver;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.junit.runner.RunWith;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BehaviorTestConfiguration.class)
public class AllStories extends JUnitStories {

	public Configuration configuration() {
		return new MostUsefulConfiguration()
				.useStoryLoader(new LoadFromClasspath())
				.useStoryPathResolver(new UnderscoredCamelCaseResolver())
				.useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
	}

	@Override
	protected List<String> storyPaths() {
		ResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
		Resource[] mappingLocations = new Resource[0];
		try {
			mappingLocations = patternResolver.getResources("classpath*:behavior/**/*.story");
			return asList(mappingLocations).stream().map(m -> {
				URI uri = null;
				try {
					uri = m.getURI();
					String[] split = uri.toString().split("behavior/");
					return "behavior/" + split[split.length - 1];
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}).collect(toList());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


}

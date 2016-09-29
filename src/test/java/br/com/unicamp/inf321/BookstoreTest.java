package br.com.unicamp.inf321;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assertions;
import org.graphstream.graph.Graph;
import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.event.Observer;
import org.graphwalker.core.generator.AStarPath;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.java.test.Result;
import org.junit.Test;

import br.com.unicamp.inf321.helper.GraphWalkerTestBuilder;
import br.com.unicamp.inf321.models.SmallExampleModel;

public class BookstoreTest {
	public final static Path MODEL_PATH = Paths.get("/br/com/unicamp/inf321/UserCase1_PesquisarProduto.graphml");
	private Observer observer;
	private Graph graph;

	@Test
	public void runSmokeTest() {
		Result result = new GraphWalkerTestBuilder()
				.addModel(MODEL_PATH,
						new AStarPath(new ReachedVertex("v_VerifySomeOtherAction")), new SmallExampleModel())
				.addObserver(observer)
				.execute(true);
		Assertions.assertThat(result.getErrors()).as("Errors: [" + String.join(", ", result.getErrors()) + "]").isNullOrEmpty();
	}
	

	@Test
	public void runFunctionalTest() {
		Result result = new GraphWalkerTestBuilder()
				.addModel(MODEL_PATH, new RandomPath(new EdgeCoverage(100)), new SmallExampleModel())
				.addObserver(observer)
				.execute(true);
		Assertions.assertThat(result.getErrors()).as("Errors: [" + String.join(", ", result.getErrors()) + "]").isNullOrEmpty();
	}
	

	@Test
	public void runStabilityTest() {
		Result result = new GraphWalkerTestBuilder()
				.addModel(MODEL_PATH,
						new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)), new SmallExampleModel())
				.addObserver(observer)
				.execute(true);
		Assertions.assertThat(result.getErrors()).as("Errors: [" + String.join(", ", result.getErrors()) + "]").isNullOrEmpty();
	}
}

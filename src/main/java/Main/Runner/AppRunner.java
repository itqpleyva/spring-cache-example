package Main.Runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Main.Repository.FruitRepository;

@Component
public class AppRunner implements CommandLineRunner {

	  private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

	  private final FruitRepository fruitRepository;

	  public AppRunner(FruitRepository fruitRepository) {
	    this.fruitRepository = fruitRepository;
	  }
	@Override
	public void run(String... args) throws Exception {
		
	    logger.info("....Searching fruits");
	    logger.info("Coco -->" + fruitRepository.getByName("Coco"));
	    logger.info("Coco -->" + fruitRepository.getByName("Coco"));
	    logger.info("Guayaba -->" + fruitRepository.getByName("Guayaba"));
	    logger.info("Coco -->" + fruitRepository.getByName("Coco"));
	    logger.info("Pera -->" + fruitRepository.getByName("Pera"));
	    logger.info("Mango -->" + fruitRepository.getByName("Mango"));

	}

}

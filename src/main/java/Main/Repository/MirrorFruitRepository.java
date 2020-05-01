package Main.Repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import Main.Model.Fruit;

@Component
public class MirrorFruitRepository implements FruitRepository {

	@Override
	@Cacheable("fruits")
	public Fruit getByName(String name) {
		
	    SlowService();
	    
	    return new Fruit(8,name);
	  }

	  private void SlowService() {
	    try {
	      long time = 4000L;
	      Thread.sleep(time);
	    } catch (InterruptedException e) {
	      throw new IllegalStateException(e);
	    }
	  }

}

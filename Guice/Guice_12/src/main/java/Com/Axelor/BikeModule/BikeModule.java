package Com.Axelor.BikeModule;

import com.Axelor.Multibinding.Bike;
import com.Axelor.Powercomparison.Normal;
import com.Axelor.Powercomparison.Racing;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class BikeModule extends AbstractModule {

	@Override
	protected void configure() {
		Multibinder<Bike> multibinder = Multibinder.newSetBinder(binder(), Bike.class);
	      multibinder.addBinding().to(Normal.class);  
	     multibinder.addBinding().to(Racing.class);  
	     multibinder.permitDuplicates();
	}
	
	
}

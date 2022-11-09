package Com.Axelor.BikeModule;

import com.Axelor.Multibinding.Bike;
import com.Axelor.Powercomparison.Racing;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class BikeModular2  extends AbstractModule {

	@Override
	protected void configure() {
		Multibinder<Bike> multibinder = Multibinder.newSetBinder(binder(), Bike.class);
	      multibinder.addBinding().to(Racing.class);
	      multibinder.permitDuplicates();
	}
}

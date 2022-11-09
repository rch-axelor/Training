package com.Axelor.justintimeinjectableConstructor;


import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;



	@ImplementedBy(Airtel.class)
	interface Sim
	{
		public void getSim();
	}
	
	
	
	class Airtel implements Sim
	{
		@Inject @Named("sim1")
		private String name ;
		
		public Airtel() {		}

		@Override
		public void getSim() {
          
			System.out.println("its an Airtell sim");
			System.out.println(name);
		}
	}
	
	
	
	class Simodule   extends AbstractModule
	{
		@Override
		protected void configure() {
 
			bind(String.class).annotatedWith(Names.named("sim1")).toInstance("jaga");
		}
	}
	
	
	
	
	class Mysim
	{
		private  Sim sim;
		
		
		@Inject
		public Mysim(Sim sim) {
			super();
			this.sim = sim;
		}



		public void getSim()
		{
			sim.getSim();
		}
	}
	
	
	
	
	
	
	public class Type2 {
	
	
	public static void main(String[] args) {


		Injector injector = Guice.createInjector(new Simodule());
		Mysim mysim=injector.getInstance(Mysim.class);
		mysim.getSim();
		
     		
	}

}











































































































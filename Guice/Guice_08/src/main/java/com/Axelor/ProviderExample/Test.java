package com.Axelor.ProviderExample;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

/*interface*/
interface Game
{
	public void getgame();
}



/*Games implementation*/
class cricket implements Game
{
	String name;
	int age;
	
	@Inject
	public cricket(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void getgame() {
		System.out.println("my name is"+name+"and my age is "+age+" and i like Cricket");
		
	}
	
}

/*My Game */

class MyGame
{
	private Game game;

	@Inject
	public MyGame(Game game) {
		super();
		this.game = game;
	}
	
	public void getgame()
	{
		this.game.getgame();
	}
	
}

/*Game provider*/
class GameProvide implements Provider<Game>
{

	@Override
	public Game get() {
		String name = "jaga";
		int age  = 22;
		return new cricket(name, age);
	}
}

/*binding module*/

class Gamebinder extends AbstractModule
{
	@Override
	protected void configure() {

		bind(Game.class).toProvider(GameProvide.class);
		super.configure();
	}
}






public class Test {
	
	public static void main(String[] args) {
		
		Injector inject = Guice.createInjector(new Gamebinder());
		MyGame game = inject.getInstance(MyGame.class);
		game.getgame();
	}
}
































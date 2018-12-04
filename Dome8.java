package TWO_TEST;

interface Food{
	void food();
	default void food1() {
		System.out.println("吃食物");
	}
}

class Feeder{
	public void feed(Animal animal,Food food) {
		animal.show();
		food.food();
	}
}

class Animal{
	public void eat(Food food) {
		food.food();
	}
	public void show(){
		System.out.println("我是一只小动物");
	}
}

class Dog extends Animal{
	public void show(){
		System.out.println("我是一只小狗");
	}
	public void run() {
		System.out.println("小狗在跑");
	}
}

class Cat extends Animal{
	public void show(){
		System.out.println("我是一只小猫");
	}
	public void play() {
		System.out.println("小猫在玩");
	}
}

class Fish extends Animal implements Food{
	public void food() {
		System.out.println("食物--鱼");
	}
	public void show(){
		System.out.println("我是一条小鱼");
	}
	public void swim() {
		System.out.println("小鱼在水里游");
	}
}

class Bone implements Food{
	public void food() {
		System.out.println("食物--骨头");
	}
}


public class Dome8 {
	public static void main(String[] args) {
		Fish fish = new Fish();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Feeder feed = new Feeder();
		Bone bone = new Bone();
		Animal animal = new Animal();
		feed.feed(dog, bone);
		cat.play();
		animal.show();
		animal.eat(fish);
	}
}

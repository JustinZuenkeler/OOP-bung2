package business;

public class ConcreteTxtWriterCreator extends WriterCreator{
	@Override
	public WriterProduct factoryMethod(){
		return new ConcreteTxtWriterProduct();
	}
	
}

package business;

public class ConcreteWriterCreator extends WriterCreator {
	@Override
	public WriterProduct factoryMethod(String typ){
	if("txt".equals(typ)){
	return new ConcreteTxtWriterProduct();
	}
	else{
	return new ConcreteKonsoleWriterProduct();
	}
	}

	@Override
	public WriterProduct factoryMethod() {
		// TODO Auto-generated method stub
		return null;
	}
}

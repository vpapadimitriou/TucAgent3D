package perceptor;

public class HingeJointPerceptor
 {

	private float axis1;
	private String name;

	public HingeJointPerceptor(String name)
	{
		this(name, 0.0f);
	}
	
	public HingeJointPerceptor(String name, float axis1)
	{
		this.name = name;
		this.axis1 = axis1;
		
	}

	public float getAxis1(){
		
		return this.axis1;
	}

	public void setAxis1(float axis1) {
		
		this.axis1 = axis1;
	}


	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	



}

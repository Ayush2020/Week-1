class earthVolume{
	public static void main(String []args){

	double radius = 6378;
	double radiusCube = radius * radius * radius;
	double pi = 3.14;

	double earthVolumekm = 4 / 3 * pi * radiusCube;
	double kmToMi = 0.2399;
	double earthVolumeMi = earthVolumekm * kmToMi;
	
	System.out.println("The volume of earth in cubic kilometers is " + earthVolumekm + "and cubic miles is " + earthVolumeMi);


	}
}
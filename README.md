To access the programmes via the command line interface, 
Download the zip file, then unzip it into your chosen filepath
Identify the filepath in which it is saved, 

Access the POWERSHELL
then copy the filepath like so

Example: If saved in downloads

MAC: cd ~\Downloads\Waste-code\src
WINDOWS: cd ~\Downloads\Waste-code\src

Then, compile the driver program:
javac WasteDriver.java

After compiling, run the driver program:
java WasteDriver

Then, create objects in accordance to the type of waste being sorted,
choose from either constructor:

If the type is plastic
Waste objName = new Waste(PLASTIC) //It is required that the type is all caps

or if you have all the details:

Waste objName = new Waste( types type, double weight, 
double density, int lightSpectra,
String color, String item,
boolean isMagnetic, boolean isSinkable, 
boolean isWaterproof, boolean isCompostable)

General getters and mutators:
GETTERS: - getType() - getNewType() - getWeight() - getLightSpectra() -
getIsMagnetic() - getDensity() - getIsMeltable() - getIsCompostable() -
getType(boolean val) - getCount() - getColor() - getItem() -
getIsSinkable() - getIsWaterproof()

SETTERS: - setLightSpectra(int lightSpectra) - setIsWterproof(boolean
isWaterproof) - setIsSinkable(boolean isSinkable) - setColor(String
color) - setItem(String item) - setType(types type) - setWeight(double
weight) - setIsMagnetic(boolean isMagnetic) - setDensity(double density)

Specified getters and mutators:
METAL:
GETTERS: getLightSpectra(), getWeight(), getIsRecyclable()
SETTERS: setLightSpectra(int LightSpectrum)

PLASTIC:
GETTERS: getType(), getMeltable(), getWeight()
SETTERS: setType(String type), setMeltable(boolean meltable)

ORGANIC:
GETTERS: getType(), getIsCompostable()
SETTERS: setType(String type), setIsCompostable(boolean isCompostable)

PAPER:
GETTERS: getIsRecyclable(), getPaperType(), getAllPapers(), getPaperCategories()
SETTERS: setIsRecyclable(boolean isRecycable), setPaperType(String paperType)


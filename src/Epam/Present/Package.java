package Present;

import EnumsForTask5.TypeOFColour;
import EnumsForTask5.TypeOfMaterial;
import EnumsForTask5.TypeOfPackages;

public class Package {
    private TypeOFColour typeOFColour;
    private TypeOfMaterial typeOfMaterial;
    private TypeOfPackages typeOfPackages;
    public static class Builder{
        private Package newPackage;
        public Builder(){
            newPackage=new Package();
        }

        public Builder withMaterial(String materialType){
            try {
                newPackage.typeOfMaterial=TypeOfMaterial.valueOf(materialType);
            }catch (IllegalArgumentException e){
                System.err.println("Sorry, we don't have\""+materialType+"\"such type of material");
            }
            return this;
        }

        public Builder withColour(String typeOfColour){
            try {
                newPackage.typeOFColour=TypeOFColour.valueOf(typeOfColour);
            }catch (IllegalArgumentException e){
                System.err.println("Sorry, we don't have\""+typeOfColour+"\"such type of colour");
            }
            return this;
        }

        public Builder withPackages(String typeOfPackage){
            try {
                newPackage.typeOfPackages=TypeOfPackages.valueOf(typeOfPackage);
            }catch (IllegalArgumentException e){
                System.err.println("Sorry,we don't have\""+typeOfPackage+"\"such type of package");
            }
            return this;
        }

        public Package build(){
            return newPackage;
        }
    }

    @Override
    public String toString() {
        return "typeOFColour=" + typeOFColour +
                ", typeOfMaterial=" + typeOfMaterial +
                ", typeOfPackages=" + typeOfPackages;
    }
}

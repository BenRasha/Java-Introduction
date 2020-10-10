package ProgrammingWithClasses.SimpleClassesAndObjects.Task4;

public class Train {

    private String destinationName;
    private int trainNumber;
    private String departureTime;

    public Train(String destinationName,int trainNumber,String departureTime){
        this.destinationName=destinationName;
        this.trainNumber=trainNumber;
        this.departureTime=departureTime;
    }

    public static Train[] trainNumberSort(Train []trains) {
        Train temp;
        for (int i=0;i<trains.length;i++){
            for (int j=0;j<trains.length-1;j++){
                if (trains[j].trainNumber>trains[j+1].trainNumber){
                    temp=trains[j];
                    trains[j]=trains[j+1];
                    trains[j+1]=temp;
                }
            }
        }
       return trains;
    }

    public static Train[] trainDestinationNameSort(Train[] trains){
        Train temp;
        for (int i=0;i<trains.length;i++){
            for (int j=0;j<trains.length-1;j++){
                if (trains[j].destinationName.compareTo(trains[j+1].destinationName)>0){
                    temp=trains[j];
                    trains[j]=trains[j+1];
                    trains[j+1]=temp;
                }else if(trains[j].destinationName.compareTo(trains[j+1].destinationName)==0){
                    if (trains[j].departureTime.compareTo(trains[j+1].departureTime)>0){
                        temp=trains[j];
                        trains[j]=trains[j+1];
                        trains[j+1]=temp;
                    }
                }
            }
        }
    return trains;
    }

    public static void neededTrainOutput(Train []trains,int input){
        for (Train train:trains){
            if (input==train.trainNumber){
                System.out.println("["+train.destinationName+" "+train.trainNumber+" "+train.departureTime+"]");
            }
        }
    }

    public static void trainOutput(Train[]trains){
        for (Train train:trains){
            System.out.println("[Destination name:"+train.destinationName+", Train number:"+train.trainNumber+", DepartureTime:"+train.departureTime+"]");
        }
    }
}

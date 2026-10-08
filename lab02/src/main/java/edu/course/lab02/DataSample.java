package edu.course.lab02;
public class DataSample{
private String id;
private String label;
private SampleStatus status;
private double[] features;

    public DataSample(String id, String label, SampleStatus status ,double[] features) {
        if((features != null)&&
        (id != null && !id.isEmpty())&&
        (label != null && !label.isEmpty())&&
        (status != null)){
        this.features = features.clone();
        this.id = id;
        this.label = label;
        this.status = status;
        }
        else{
            throw new NullPointerException("все поля должны быть заполнены");
        }
    }
    public void changeStatus(SampleStatus status){
        if (status!=null){
            this.status = status;
        }
        else{
            throw new NullPointerException("все поля должны быть заполнены");
        }
    }
    public boolean checkready(){
        if (status == SampleStatus.READY){
            return true;
        }
        else{
            return false;
        }
    }
    public double averagee(){
        double sum = 0;
        for (int i = 0 ; i<features.length ; i++){
            sum += features[i];
        }
        return sum/features.length;
    }
}



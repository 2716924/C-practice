import java.util.*;
public class allMarks {
    LinkedList<MarkRecord> marks;
    public void MarkStore(){
        marks = new LinkedList<>();
    }
    public class MarkRecord{
        public String name;
        public double mark;
    }
    public void makeNewRecord(String name,double mark){
        MarkRecord newRecord = new MarkRecord();
        newRecord.name = name;
        newRecord.mark = mark;
        marks.add(newRecord);
    }
    public double getMark(String name){
        for(MarkRecord s : marks){
            if (s.name.equals(name)){
                return s.mark;
            }
        }
       return -1;
    }
    public double getAverageMark(){
        double sum = 0;
        for(MarkRecord s : marks){
            sum = sum+s.mark;
        }
        return sum/marks.size();
    }
    
}

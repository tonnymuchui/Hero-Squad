import jdk.internal.dynalink.beans.StaticClass;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {

    private String mName;
    private int mAge;
    private String mSpecialPower;
    private String mweakness;
    private boolean mCompleted;
    private LocalDateTime mCreatedAt;
    private static List<Hero> instances = new ArrayList<Hero>();
private int mId;

    public Hero(String name, int age, String specialPower, String weakness){
        mName = name;
        mAge = age;
        mSpecialPower = specialPower;
        mweakness = weakness;
        mCompleted = false;
        mCreatedAt = LocalDateTime.now();
        instances.add(this);
        mId = instances.size();
    }

   public String getName() {
        return mName;
   }

   public int getAge(){
        return mAge;
   }

   public String getPower(){
        return mSpecialPower;
   }

   public String getWeakness(){
        return mweakness;
   }

   public boolean ismCompleted(){
        return mCompleted;
   }

   public LocalDateTime getmCreatedAt(){
        return mCreatedAt;
   }

   public static List<Hero> all() {
        return instances;
   }

   public static void clear(){
        instances.clear();
   }

   public int getId() {
        return mId;
   }

   public static Hero find(int id) {
        return instances.get(id-1);
   }
}

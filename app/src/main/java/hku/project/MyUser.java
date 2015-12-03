package hku.project;

import java.util.List;

/**
 * Created by LZ on 15/12/3.
 */
public class MyUser {
    private int uid;
    private String name;
    private int gender;
    private String imgPath;
    private int title;
    private MyTime sleepTime;
    private MyTime studyTime;
    private int targetFinished;
    private int targetNotFinished;
    private List<MyTarget> myTargetList;
    private List<MyStar> myStarList;
    private MyRank myRank;
    private MyDress myDress;
    private List<MyPlan> myPlanList;
    private MyMission crtMission;


    public MyUser(){
        
    }

}

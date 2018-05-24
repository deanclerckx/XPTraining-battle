package be.cegeka.battle;


public interface IHeadquarters {

    int ReportEnlistment(String soldierName);

    void ReportCasuality(int soldierId);

    void ReportVictory(int remainingNumberOfSoldiers);

}

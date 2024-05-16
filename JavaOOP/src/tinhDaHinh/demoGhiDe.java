package tinhDaHinh;

import tinhkethua.basetest.BaseTest;

public class demoGhiDe extends BaseTest {
    public  void  createBrowser(){
        System.out.println("Run on Chrome Browser");
        System.out.println("Config chặn notification");
        System.out.println("Config chặn save password");
        System.out.println("Config chặn chế độ headless");
    }
    public  void testAddUser(){
        createBrowser();
    }
    public static void main(String[] args) {
        demoGhiDe demoGhiDe = new demoGhiDe();
        demoGhiDe.createBrowser();
    }
}


package org.appops.github;

import java.io.FileReader;
import java.util.Properties;

public class GHEmailScrapeEntryPoint {

  public static void main(String[] args) throws Exception {
    FileReader githubAccountreader = new FileReader("src/main/resources/github-account.properties");
    FileReader githubOrganizationreader =
        new FileReader("src/main/resources/github-organization.properties");

    Properties ghAccountProp = new Properties();
    ghAccountProp.load(githubAccountreader);

    Properties ghOrganizationProp = new Properties();
    ghOrganizationProp.load(githubOrganizationreader);

    ghAccountProp.size();

    System.out.println(ghAccountProp.getProperty("userName1"));
    System.out.println(ghAccountProp.getProperty("personal_token1"));
    System.out.println(ghOrganizationProp.getProperty("1"));

    ////////////////////////////////////////////////////////////////////////////////////

    GHContribEmailScrape ghContribEmailScrape1 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName1"),
            ghAccountProp.getProperty("personal_token1"), ghOrganizationProp.getProperty("1"));

    GHWatchersEmailScrape ghWatchersEmailScrape1 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName1"),
            ghAccountProp.getProperty("personal_token1"), ghOrganizationProp.getProperty("1"));


    GHForkersEmailScrape ghForkersEmailScrape1 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName1"),
            ghAccountProp.getProperty("personal_token1"), ghOrganizationProp.getProperty("1"));

    GHStargazersEmailScrape ghStargazersEmailScrape1 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName1"),
            ghAccountProp.getProperty("personal_token1"), ghOrganizationProp.getProperty("1"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape2 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName2"),
            ghAccountProp.getProperty("personal_token2"), ghOrganizationProp.getProperty("2"));

    GHWatchersEmailScrape ghWatchersEmailScrape2 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName2"),
            ghAccountProp.getProperty("personal_token2"), ghOrganizationProp.getProperty("2"));


    GHForkersEmailScrape ghForkersEmailScrape2 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName2"),
            ghAccountProp.getProperty("personal_token2"), ghOrganizationProp.getProperty("2"));

    GHStargazersEmailScrape ghStargazersEmailScrape2 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName2"),
            ghAccountProp.getProperty("personal_token2"), ghOrganizationProp.getProperty("2"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape3 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName3"),
            ghAccountProp.getProperty("personal_token3"), ghOrganizationProp.getProperty("3"));

    GHWatchersEmailScrape ghWatchersEmailScrape3 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName3"),
            ghAccountProp.getProperty("personal_token3"), ghOrganizationProp.getProperty("3"));


    GHForkersEmailScrape ghForkersEmailScrape3 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName3"),
            ghAccountProp.getProperty("personal_token1"), ghOrganizationProp.getProperty("3"));

    GHStargazersEmailScrape ghStargazersEmailScrape3 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName3"),
            ghAccountProp.getProperty("personal_token3"), ghOrganizationProp.getProperty("3"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape4 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName4"),
            ghAccountProp.getProperty("personal_token4"), ghOrganizationProp.getProperty("4"));

    GHWatchersEmailScrape ghWatchersEmailScrape4 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName4"),
            ghAccountProp.getProperty("personal_token4"), ghOrganizationProp.getProperty("4"));


    GHForkersEmailScrape ghForkersEmailScrape4 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName4"),
            ghAccountProp.getProperty("personal_token4"), ghOrganizationProp.getProperty("4"));

    GHStargazersEmailScrape ghStargazersEmailScrape4 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName4"),
            ghAccountProp.getProperty("personal_token4"), ghOrganizationProp.getProperty("4"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape5 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName5"),
            ghAccountProp.getProperty("personal_token5"), ghOrganizationProp.getProperty("5"));

    GHWatchersEmailScrape ghWatchersEmailScrape5 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName5"),
            ghAccountProp.getProperty("personal_token5"), ghOrganizationProp.getProperty("5"));


    GHForkersEmailScrape ghForkersEmailScrape5 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName5"),
            ghAccountProp.getProperty("personal_token5"), ghOrganizationProp.getProperty("5"));

    GHStargazersEmailScrape ghStargazersEmailScrape5 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName5"),
            ghAccountProp.getProperty("personal_token5"), ghOrganizationProp.getProperty("5"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape6 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName6"),
            ghAccountProp.getProperty("personal_token6"), ghOrganizationProp.getProperty("6"));

    GHWatchersEmailScrape ghWatchersEmailScrape6 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName6"),
            ghAccountProp.getProperty("personal_token6"), ghOrganizationProp.getProperty("6"));


    GHForkersEmailScrape ghForkersEmailScrape6 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName6"),
            ghAccountProp.getProperty("personal_token6"), ghOrganizationProp.getProperty("6"));

    GHStargazersEmailScrape ghStargazersEmailScrape6 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName6"),
            ghAccountProp.getProperty("personal_token6"), ghOrganizationProp.getProperty("6"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape7 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName7"),
            ghAccountProp.getProperty("personal_token7"), ghOrganizationProp.getProperty("7"));

    GHWatchersEmailScrape ghWatchersEmailScrape7 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName7"),
            ghAccountProp.getProperty("personal_token7"), ghOrganizationProp.getProperty("7"));


    GHForkersEmailScrape ghForkersEmailScrape7 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName7"),
            ghAccountProp.getProperty("personal_token7"), ghOrganizationProp.getProperty("7"));

    GHStargazersEmailScrape ghStargazersEmailScrape7 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName7"),
            ghAccountProp.getProperty("personal_token7"), ghOrganizationProp.getProperty("7"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape8 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName8"),
            ghAccountProp.getProperty("personal_token8"), ghOrganizationProp.getProperty("8"));

    GHWatchersEmailScrape ghWatchersEmailScrape8 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName8"),
            ghAccountProp.getProperty("personal_token8"), ghOrganizationProp.getProperty("8"));


    GHForkersEmailScrape ghForkersEmailScrape8 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName8"),
            ghAccountProp.getProperty("personal_token8"), ghOrganizationProp.getProperty("8"));

    GHStargazersEmailScrape ghStargazersEmailScrape8 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName8"),
            ghAccountProp.getProperty("personal_token8"), ghOrganizationProp.getProperty("8"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape9 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName9"),
            ghAccountProp.getProperty("personal_token9"), ghOrganizationProp.getProperty("9"));

    GHWatchersEmailScrape ghWatchersEmailScrape9 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName9"),
            ghAccountProp.getProperty("personal_token9"), ghOrganizationProp.getProperty("9"));


    GHForkersEmailScrape ghForkersEmailScrape9 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName9"),
            ghAccountProp.getProperty("personal_token9"), ghOrganizationProp.getProperty("9"));

    GHStargazersEmailScrape ghStargazersEmailScrape9 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName9"),
            ghAccountProp.getProperty("personal_token9"), ghOrganizationProp.getProperty("9"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape10 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName10"),
            ghAccountProp.getProperty("personal_token10"), ghOrganizationProp.getProperty("10"));

    GHWatchersEmailScrape ghWatchersEmailScrape10 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName10"),
            ghAccountProp.getProperty("personal_token10"), ghOrganizationProp.getProperty("10"));


    GHForkersEmailScrape ghForkersEmailScrape10 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName10"),
            ghAccountProp.getProperty("personal_token10"), ghOrganizationProp.getProperty("10"));

    GHStargazersEmailScrape ghStargazersEmailScrape10 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName10"),
            ghAccountProp.getProperty("personal_token10"), ghOrganizationProp.getProperty("10"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape11 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName11"),
            ghAccountProp.getProperty("personal_token11"), ghOrganizationProp.getProperty("11"));

    GHWatchersEmailScrape ghWatchersEmailScrape11 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName11"),
            ghAccountProp.getProperty("personal_token11"), ghOrganizationProp.getProperty("11"));


    GHForkersEmailScrape ghForkersEmailScrape11 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName11"),
            ghAccountProp.getProperty("personal_token11"), ghOrganizationProp.getProperty("11"));

    GHStargazersEmailScrape ghStargazersEmailScrape11 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName11"),
            ghAccountProp.getProperty("personal_token11"), ghOrganizationProp.getProperty("11"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape12 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName12"),
            ghAccountProp.getProperty("personal_token12"), ghOrganizationProp.getProperty("12"));

    GHWatchersEmailScrape ghWatchersEmailScrape12 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName12"),
            ghAccountProp.getProperty("personal_token12"), ghOrganizationProp.getProperty("12"));


    GHForkersEmailScrape ghForkersEmailScrape12 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName12"),
            ghAccountProp.getProperty("personal_token12"), ghOrganizationProp.getProperty("12"));

    GHStargazersEmailScrape ghStargazersEmailScrape12 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName12"),
            ghAccountProp.getProperty("personal_token12"), ghOrganizationProp.getProperty("12"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape13 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName13"),
            ghAccountProp.getProperty("personal_token13"), ghOrganizationProp.getProperty("13"));

    GHWatchersEmailScrape ghWatchersEmailScrape13 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName13"),
            ghAccountProp.getProperty("personal_token13"), ghOrganizationProp.getProperty("13"));


    GHForkersEmailScrape ghForkersEmailScrape13 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName13"),
            ghAccountProp.getProperty("personal_token13"), ghOrganizationProp.getProperty("13"));

    GHStargazersEmailScrape ghStargazersEmailScrape13 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName13"),
            ghAccountProp.getProperty("personal_token13"), ghOrganizationProp.getProperty("13"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape14 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName14"),
            ghAccountProp.getProperty("personal_token14"), ghOrganizationProp.getProperty("14"));

    GHWatchersEmailScrape ghWatchersEmailScrape14 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName14"),
            ghAccountProp.getProperty("personal_token14"), ghOrganizationProp.getProperty("14"));


    GHForkersEmailScrape ghForkersEmailScrape14 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName14"),
            ghAccountProp.getProperty("personal_token14"), ghOrganizationProp.getProperty("14"));

    GHStargazersEmailScrape ghStargazersEmailScrape14 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName14"),
            ghAccountProp.getProperty("personal_token14"), ghOrganizationProp.getProperty("14"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape15 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName15"),
            ghAccountProp.getProperty("personal_token15"), ghOrganizationProp.getProperty("15"));

    GHWatchersEmailScrape ghWatchersEmailScrape15 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName15"),
            ghAccountProp.getProperty("personal_token15"), ghOrganizationProp.getProperty("15"));


    GHForkersEmailScrape ghForkersEmailScrape15 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName15"),
            ghAccountProp.getProperty("personal_token15"), ghOrganizationProp.getProperty("15"));

    GHStargazersEmailScrape ghStargazersEmailScrape15 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName15"),
            ghAccountProp.getProperty("personal_token15"), ghOrganizationProp.getProperty("15"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape16 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName16"),
            ghAccountProp.getProperty("personal_token16"), ghOrganizationProp.getProperty("16"));

    GHWatchersEmailScrape ghWatchersEmailScrape16 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName16"),
            ghAccountProp.getProperty("personal_token16"), ghOrganizationProp.getProperty("16"));


    GHForkersEmailScrape ghForkersEmailScrape16 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName16"),
            ghAccountProp.getProperty("personal_token16"), ghOrganizationProp.getProperty("16"));

    GHStargazersEmailScrape ghStargazersEmailScrape16 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName16"),
            ghAccountProp.getProperty("personal_token16"), ghOrganizationProp.getProperty("16"));

    ////////////////////////////////////////////////////////////////////////////////////////////////


    GHContribEmailScrape ghContribEmailScrape17 =
        new GHContribEmailScrape(ghAccountProp.getProperty("userName17"),
            ghAccountProp.getProperty("personal_token17"), ghOrganizationProp.getProperty("17"));

    GHWatchersEmailScrape ghWatchersEmailScrape17 =
        new GHWatchersEmailScrape(ghAccountProp.getProperty("userName17"),
            ghAccountProp.getProperty("personal_token17"), ghOrganizationProp.getProperty("17"));


    GHForkersEmailScrape ghForkersEmailScrape17 =
        new GHForkersEmailScrape(ghAccountProp.getProperty("userName17"),
            ghAccountProp.getProperty("personal_token17"), ghOrganizationProp.getProperty("17"));

    GHStargazersEmailScrape ghStargazersEmailScrape17 =
        new GHStargazersEmailScrape(ghAccountProp.getProperty("userName17"),
            ghAccountProp.getProperty("personal_token17"), ghOrganizationProp.getProperty("17"));

    ////////////////////////////////////////////////////////////////////////////////////////////////

    ghContribEmailScrape1.start();
    ghWatchersEmailScrape1.start();
    ghForkersEmailScrape1.start();
    ghStargazersEmailScrape1.start();

    ghContribEmailScrape2.start();
    ghWatchersEmailScrape2.start();
    ghForkersEmailScrape2.start();
    ghStargazersEmailScrape2.start();

    ghContribEmailScrape3.start();
    ghWatchersEmailScrape3.start();
    ghForkersEmailScrape3.start();
    ghStargazersEmailScrape3.start();

    ghContribEmailScrape4.start();
    ghWatchersEmailScrape4.start();
    ghForkersEmailScrape4.start();
    ghStargazersEmailScrape4.start();

    ghContribEmailScrape5.start();
    ghWatchersEmailScrape5.start();
    ghForkersEmailScrape5.start();
    ghStargazersEmailScrape5.start();

    ghContribEmailScrape6.start();
    ghWatchersEmailScrape6.start();
    ghForkersEmailScrape6.start();
    ghStargazersEmailScrape6.start();

    ghContribEmailScrape7.start();
    ghWatchersEmailScrape7.start();
    ghForkersEmailScrape7.start();
    ghStargazersEmailScrape7.start();

    ghContribEmailScrape8.start();
    ghWatchersEmailScrape8.start();
    ghForkersEmailScrape8.start();
    ghStargazersEmailScrape8.start();

    ghContribEmailScrape9.start();
    ghWatchersEmailScrape9.start();
    ghForkersEmailScrape9.start();
    ghStargazersEmailScrape9.start();

    ghContribEmailScrape10.start();
    ghWatchersEmailScrape10.start();
    ghForkersEmailScrape10.start();
    ghStargazersEmailScrape10.start();

    ghContribEmailScrape11.start();
    ghWatchersEmailScrape11.start();
    ghForkersEmailScrape11.start();
    ghStargazersEmailScrape11.start();

    ghContribEmailScrape12.start();
    ghWatchersEmailScrape12.start();
    ghForkersEmailScrape12.start();
    ghStargazersEmailScrape12.start();

    ghContribEmailScrape13.start();
    ghWatchersEmailScrape13.start();
    ghForkersEmailScrape13.start();
    ghStargazersEmailScrape13.start();

    ghContribEmailScrape14.start();
    ghWatchersEmailScrape14.start();
    ghForkersEmailScrape14.start();
    ghStargazersEmailScrape14.start();

    ghContribEmailScrape15.start();
    ghWatchersEmailScrape15.start();
    ghForkersEmailScrape15.start();
    ghStargazersEmailScrape15.start();

    ghContribEmailScrape16.start();
    ghWatchersEmailScrape16.start();
    ghForkersEmailScrape16.start();
    ghStargazersEmailScrape16.start();

    ghContribEmailScrape17.start();
    ghWatchersEmailScrape17.start();
    ghForkersEmailScrape17.start();
    ghStargazersEmailScrape17.start();

  }
}

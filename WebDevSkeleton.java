package tinker;

import java.io.*;


// prompt user for input: project name, one word like camelCase or dash-split
// save this to variable, use it to title files

/**
 * Created by timday on 10/12/17.
 */
public class WebDevSkeleton {


    /**
     * creates a HTML file and populates it with the skeleton code I need every time
     */
    public void makeHTMLTemplate() {
        try {
            // Create HTML file
            File html = new File("testIO//index.html");

            // populate HTML template
            PrintWriter pw = new PrintWriter(new FileOutputStream("testIO//index.html"));
            pw.println("<!DOCTYPE html>");
            pw.println("<html lang=\"en\">");
            pw.println("");
            pw.println("<head>");
            pw.println("\t<meta charset=\"utf-8\">");
            pw.println("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            pw.println("\t<link rel=\"stylesheet\" href=\"\">");
            pw.println("\t<title></title>");
            pw.println("</head>");
            pw.println("");
            pw.println("<body>");
            pw.println("\t<header></header>");
            pw.println("\t<main></main>");
            pw.println("\t<footer></footer>");
            pw.println("");
            pw.println("");
            pw.println("");
            pw.println("<script type=\"text/javascript\" src=\"\"></script>");
            pw.println("</body>");
            pw.println("");
            pw.println("</html>");
            pw.close();

            if (html.createNewFile()){
                System.out.println("HTML file created and populated!");
            }else{
                System.out.println("HTML already exists.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * creates a CSS file and adds some catchalls that I always add anyway
     * @param projName - program requires user input of the project name
     */
    public void makeCSSTemplate(String projName) {

        try {
            //create Styles directory and css file
            File css = new File("testIO//styles//" + projName + ".css");
            css.getParentFile().mkdirs();

            //populate css file
            PrintWriter pw = new PrintWriter(new FileOutputStream("testIO//styles//" + projName + ".css"));
            pw.println("");
            pw.println("/* catchall - no-scroll resizing for smaller devices */");
            pw.println("img, embed, object, video {");
            pw.println("\tmax-width: 100%;");
            pw.println("\theight: auto;");
            pw.println("}");
            pw.println("/* catchall - tap space for smaller devices */");
            pw.println("nav a, button {");
            pw.println("\tmin-height: 48px;");
            pw.println("\tmin-width: 48px;");
            pw.println("}");
            pw.println("");
            pw.close();

            if (css.createNewFile()) {
                System.out.println("Styles directory is created!");
            } else {
                System.out.println("Styles directory already exists.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * creates a scripts dir and js file, populated with any catchall js I am using
     * @param projName
     */
    public void makeJSTemplate(String projName) {
        try {

            //create scripts directory and js file
            File js = new File("testIO//scripts//" + projName + ".js");
            js.getParentFile().mkdirs();


            //populate JS file
            PrintWriter pw = new PrintWriter(new FileOutputStream("testIO//scripts//" + projName + ".js"));
            pw.println("");
            pw.println("console.log(\"Author: Tim Day\"");
            pw.close();


            if (js.createNewFile()){
                System.out.println("Scripts directory is created!");
            }else{
                System.out.println("Scripts directory already exists.");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * create the directories for storing assets
     * icons for vector graphics
     * photos for kastor
     */
    public void makeAssetsDirectories() {
        try {

            // Assets Directory - Assets/icons
            String pathA = "testIO//assets//icons";
            File ass = new File(pathA);
            ass.getParentFile().mkdirs();
            ass.getCanonicalFile().mkdir();

            if (ass.exists() && ass.isDirectory()){
                System.out.println("Assets and icons Directories created!");
            }else{
                System.out.println("Assets and icons Directories  already exist.");
            }

            // Assets Directory - Assets/photos

            String pathP = "testIO//assets//photos";
            File ass2 = new File(pathP);
            ass2.getCanonicalFile().mkdir();

            if (ass2.exists() && ass2.isDirectory()){
                System.out.println("Assets/photo directory created!");
            }else{
                System.out.println("Assets/photo Directories already exist.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     *
     * @param projName
     */
    public void makeGruntInstallationFile(String projName) {

        try {

            // create the package.json file for Grunt
            String pathA = "testIO//package.json";
            File json = new File(pathA);

            //populate the file
            PrintWriter pw = new PrintWriter(new FileOutputStream("testIO//package.json"));
            pw.println("{");
            pw.println("\t\"name\": \"" + projName + "\",");
            pw.println("\t\"version\": \"0.1.0\",");
            pw.println("\t\"devDependencies\": {");
            pw.println("\t\t\"grunt\": \"~0.4.1\"");
            pw.println("\t}");
            pw.println("}");
            pw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }



    // GitHub Files - README and LICENSE (empty)
    public void makeGutHubFiles(String projName) {

        try {

            // create files
            File l = new File("testIO//LICENSE");
            File rm = new File("testIO//README.md");
            File ig = new File("testIO//.gitignore");

            //populate files
            PrintWriter pw = new PrintWriter(new FileOutputStream("testIO//README.md"));
            pw.println("# " + projName);
            pw.close();

            PrintWriter pw2 = new PrintWriter(new FileOutputStream("testIO//LICENSE"));
            pw2.println("https://choosealicense.com/");
            pw2.println("Current License: No License");
            pw2.close();

            PrintWriter pw3 = new PrintWriter(new FileOutputStream("testIO//.gitignore"));
            pw2.println("# https://git-scm.com/docs/gitignore");
            pw2.println("# https://help.github.com/articles/ignoring-files");
            pw2.println("# Example .gitignore files: https://github.com/github/gitignore");
            pw2.println("/bower_components/");
            pw2.println("/node_modules/");
            pw2.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        if (args.length == 1) {

            System.out.println("project name input: " + args[0]);

            System.out.println("----------------------");

            WebDevSkeleton creator = new WebDevSkeleton();

            System.out.println(creator);
            creator.makeHTMLTemplate();
            creator.makeCSSTemplate(args[0]);
            creator.makeJSTemplate(args[0]);
            creator.makeAssetsDirectories();
            creator.makeGruntInstallationFile(args[0]);
            creator.makeGutHubFiles(args[0]);


            System.out.println("----------------------");

        } else {
            System.out.println("enter your file name as an argument");

        }
    } //main


}

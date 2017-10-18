package tinker;

import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


// TODO desktop icon, simple GUI with some inputs
// TODO prompt user for input: project name, one word like camelCase or dash-split
// save this to variable, use it to title files

/**
 * Created by timday on 10/12/17.
 */
public class WebDevSkeleton {

    /**
     * creates a HTML file and populates it with the skeleton code I need every time
     */
    public void makeHTMLTemplate(String date, String path, String proj) {
        try {
            // Create HTML file
            path = path + "//src//index.html";
            File html = new File(path);
            html.getParentFile().mkdirs();

            // populate HTML template
            PrintWriter pw = new PrintWriter(new FileOutputStream(path));
            pw.println("<!DOCTYPE html>");
            pw.println("<html lang=\"en\">");
            pw.println("");
            pw.println("<!-- \n\tProject: " + proj + "\n\tAuthor: Tim Day\n\tCreated: " + date + "\n-->");
            pw.println("\n<head>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "  <link rel=\"stylesheet\" href=\"styles/global.css\">\n" +
                    "  <link rel=\"stylesheet\" href=\"styles/normalize.css\">\n" +
                    "  <title></title>\n" +
                    "  <meta name=\"description\" content=\"\">\n" +
                    "  <meta name=\"author\" content=\"Tim Day\">\n" +
                    "  <meta name=\"keywords\" content=\"words, comma, separted\">\n" +
                    "\n" +
                    "  <!-- Font Imports -->\n" +
                    "  <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n" +
                    "\n" +
                    "  <!-- OG tags for social sharing -->\n" +
                    "  <meta property=\"og:site_name\" content=\"\"/>\n" +
                    "  <meta property=\"og:title\" content=\"\"/>\n" +
                    "  <meta property=\"og:description\" content=\"\"/>\n" +
                    "  <meta property=\"og:image\" content=\"\">\n" +
                    "  <meta property=\"og:url\" content=\"\">\n" +
                    "  <meta property=\"og:type\" content=\"website\"/>\n" +
                    "\t\n" +
                    "</head>\n" +
                    "\n" +
                    "<body>\n" +
                    "  <header></header>\n" +
                    "  <main>\n" +
                    "    <figure>\n" +
                    "      <img src=\"http://placehold.it/960x350\" alt=\"a placeholder img\"/>\n" +
                    "      <figcaption>a placeholder img</figcaption>\n" +
                    "    </figure>\n" +
                    "    \n" +
                    "  </main>\n" +
                    "  <footer></footer>\n" +
                    "\n" +
                    "<script type=\"text/javascript\" src=\"global.js\"></script>\n" +
                    "</body>\n" +
                    "\n" +
                    "</html>");
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
     * @param proj - program requires user input of the project name
     */
    public void makeCSSTemplate(String date, String path, String proj) {
        try {
            //create Styles directory and css file
            path = path + "//src//styles//global.css";
            File css = new File(path);
            css.getParentFile().mkdirs();

            //populate css file
            PrintWriter pw = new PrintWriter(new FileOutputStream(path));
            pw.println("/** Project: " +proj+ "\n\tDate: " + date+ "\n\tAuthor: Tim Day\n*/\n");
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
     * 14.10.2017  -  date of Normalize.css here
     * create the Normalize.css file
     * is a small CSS file that provides better cross-browser consistency in the default styling
     * of HTML elements. It’s a modern, HTML5-ready, alternative to the traditional CSS reset.
     */
    public void makeNormalizeCSSFile (String path){
        try {
            //populate normalize
            path = path + "//src//styles//normalize.css";
            PrintWriter pw = new PrintWriter(new FileOutputStream(path));
            pw.println("/*! normalize.css v7.0.0 | MIT License | github.com/necolas/normalize.css */");
            pw.println("http://nicolasgallagher.com/about-normalize-css/");
            pw.println("/* Document \n" +
                    "========================================================================== */\n");
            pw.println("/**\n" +
                    " * 1. Correct the line height in all browsers.\n" +
                    " * 2. Prevent adjustments of font size after orientation changes in\n" +
                    " *    IE on Windows Phone and in iOS.\n" +
                    " */");
            pw.println("\nhtml {\n" +
                    "  line-height: 1.15; /* 1 */\n" +
                    "  -ms-text-size-adjust: 100%; /* 2 */\n" +
                    "  -webkit-text-size-adjust: 100%; /* 2 */\n" +
                    "}");
            pw.println("");
            pw.println("/* Sections\n" +
                    "   ========================================================================== */\n");
            pw.println("/**\n" +
                    " * Remove the margin in all browsers (opinionated).\n" +
                    " */\n" +
                    "body {\n" +
                    "  margin: 0;\n" +
                    "}\n");
            pw.println("/**\n" +
                    " * Add the correct display in IE 9-.\n" +
                    " */\n" +
                    "article,\n" +
                    "aside,\n" +
                    "footer,\n" +
                    "header,\n" +
                    "nav,\n" +
                    "section {\n" +
                    "  display: block;\n" +
                    "}\n");
            pw.println("/**\n" +
                    " * Correct the font size and margin on `h1` elements within `section` and\n" +
                    " * `article` contexts in Chrome, Firefox, and Safari.\n" +
                    " */\n" +
                    "h1 {\n" +
                    "  font-size: 2em;\n" +
                    "  margin: 0.67em 0;\n" +
                    "}");
            pw.println("");

            pw.println("");
            pw.println("/* Grouping content\n" +
                    "   ========================================================================== */\n" +
                    "/**\n");
            pw.println("/**\n" +
                    " * Add the correct display in IE 9-.\n" +
                    " * 1. Add the correct display in IE.\n" +
                    " */\n" +
                    "figcaption,\n" +
                    "figure,\n" +
                    "main { /* 1 */\n" +
                    "  display: block;\n" +
                    "}\n");

            pw.println("/**\n" +
                    " * Add the correct margin in IE 8.\n" +
                    " */\n" +
                    "figure {\n" +
                    "  margin: 1em 40px;\n" +
                    "}\n");


            pw.println("/**\n" +
                    " * 1. Add the correct box sizing in Firefox.\n" +
                    " * 2. Show the overflow in Edge and IE.\n" +
                    " */\n" +
                    "hr {\n" +
                    "  box-sizing: content-box; /* 1 */\n" +
                    "  height: 0; /* 1 */\n" +
                    "  overflow: visible; /* 2 */\n" +
                    "}\n");


            pw.println("/**\n" +
                    " * 1. Correct the inheritance and scaling of font size in all browsers.\n" +
                    " * 2. Correct the odd `em` font sizing in all browsers.\n" +
                    " */");
            pw.println("pre {\n" +
                    "  font-family: monospace, monospace; /* 1 */\n" +
                    "  font-size: 1em; /* 2 */\n" +
                    "}");
            pw.println("");
            pw.println("/* Text-level semantics\n" +
                    "   ========================================================================== */\n");
            pw.println("/**\n" +
                    " * 1. Remove the gray background on active links in IE 10.\n" +
                    " * 2. Remove gaps in links underline in iOS 8+ and Safari 8+.\n" +
                    " */");
            pw.println("a {\n" +
                    "  background-color: transparent; /* 1 */\n" +
                    "  -webkit-text-decoration-skip: objects; /* 2 */\n" +
                    "}");
            pw.println("/**\n" +
                    " * 1. Remove the bottom border in Chrome 57- and Firefox 39-.\n" +
                    " * 2. Add the correct text decoration in Chrome, Edge, IE, Opera, and Safari.\n" +
                    " */");
            pw.println("abbr[title] {\n" +
                    "  border-bottom: none; /* 1 */\n" +
                    "  text-decoration: underline; /* 2 */\n" +
                    "  text-decoration: underline dotted; /* 2 */\n" +
                    "}");
            pw.println("/**\n" +
                    " * Prevent the duplicate application of `bolder` by the next rule in Safari 6.\n" +
                    " */");
            pw.println("b,\n" +
                    "strong {\n" +
                    "  font-weight: inherit;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Add the correct font weight in Chrome, Edge, and Safari.\n" +
                    " */");
            pw.println("b,\n" +
                    "strong {\n" +
                    "  font-weight: bolder;\n" +
                    "}");
            pw.println("/**\n" +
                    " * 1. Correct the inheritance and scaling of font size in all browsers.\n" +
                    " * 2. Correct the odd `em` font sizing in all browsers.\n" +
                    " */");
            pw.println("code,\n" +
                    "kbd,\n" +
                    "samp {\n" +
                    "  font-family: monospace, monospace; /* 1 */\n" +
                    "  font-size: 1em; /* 2 */\n" +
                    "}");
            pw.println("/**\n" +
                    " * Add the correct font style in Android 4.3-.\n" +
                    " */");
            pw.println("dfn {\n" +
                    "  font-style: italic;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Add the correct background and color in IE 9-.\n" +
                    " */");
            pw.println("mark {\n" +
                    "  background-color: #ff0;\n" +
                    "  color: #000;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Add the correct font size in all browsers.\n" +
                    " */\n" +
                    "small {\n" +
                    "  font-size: 80%;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Prevent `sub` and `sup` elements from affecting the line height in\n" +
                    " * all browsers.\n" +
                    " */\n" +
                    "sub,\n" +
                    "sup {\n" +
                    "  font-size: 75%;\n" +
                    "  line-height: 0;\n" +
                    "  position: relative;\n" +
                    "  vertical-align: baseline;\n" +
                    "}");
            pw.println("sub {\n" +
                    "  bottom: -0.25em;\n" +
                    "}\n" +
                    "\n" +
                    "sup {\n" +
                    "  top: -0.5em;\n" +
                    "}");
            pw.println("\n/* Embedded content\n" +
                    "   ========================================================================== */");
            pw.println("/**\n" +
                    " * Add the correct display in IE 9-.\n" +
                    " */\n" +
                    "audio,\n" +
                    "video {\n" +
                    "  display: inline-block;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Add the correct display in iOS 4-7.\n" +
                    " */\n" +
                    "audio:not([controls]) {\n" +
                    "  display: none;\n" +
                    "  height: 0;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Remove the border on images inside links in IE 10-.\n" +
                    " */\n" +
                    "img {\n" +
                    "  border-style: none;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Hide the overflow in IE.\n" +
                    " */\n" +
                    "svg:not(:root) {\n" +
                    "  overflow: hidden;\n" +
                    "}");
            pw.println("\n" +
                    "/* Forms\n" +
                    "   ========================================================================== */");
            pw.println("/**\n" +
                    " * 1. Change the font styles in all browsers (opinionated).\n" +
                    " * 2. Remove the margin in Firefox and Safari.\n" +
                    " */\n" +
                    "button,\n" +
                    "input,\n" +
                    "optgroup,\n" +
                    "select,\n" +
                    "textarea {\n" +
                    "  font-family: sans-serif; /* 1 */\n" +
                    "  font-size: 100%; /* 1 */\n" +
                    "  line-height: 1.15; /* 1 */\n" +
                    "  margin: 0; /* 2 */\n" +
                    "}");
            pw.println("/**\n" +
                    " * Show the overflow in IE.\n" +
                    " * 1. Show the overflow in Edge.\n" +
                    " */\n" +
                    "button,\n" +
                    "input { /* 1 */\n" +
                    "  overflow: visible;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Remove the inheritance of text transform in Edge, Firefox, and IE.\n" +
                    " * 1. Remove the inheritance of text transform in Firefox.\n" +
                    " */\n" +
                    "button,\n" +
                    "select { /* 1 */\n" +
                    "  text-transform: none;\n" +
                    "}");
            pw.println("/**\n" +
                    " * 1. Prevent a WebKit bug where (2) destroys native `audio` and `video`\n" +
                    " *    controls in Android 4.\n" +
                    " * 2. Correct the inability to style clickable types in iOS and Safari.\n" +
                    " */\n" +
                    "button,\n" +
                    "html [type=\"button\"], /* 1 */\n" +
                    "[type=\"reset\"],\n" +
                    "[type=\"submit\"] {\n" +
                    "  -webkit-appearance: button; /* 2 */\n" +
                    "}");
            pw.println("/**\n" +
                    " * Remove the inner border and padding in Firefox.\n" +
                    " */\n" +
                    "button::-moz-focus-inner,\n" +
                    "[type=\"button\"]::-moz-focus-inner,\n" +
                    "[type=\"reset\"]::-moz-focus-inner,\n" +
                    "[type=\"submit\"]::-moz-focus-inner {\n" +
                    "  border-style: none;\n" +
                    "  padding: 0;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Restore the focus styles unset by the previous rule.\n" +
                    " */\n" +
                    "button:-moz-focusring,\n" +
                    "[type=\"button\"]:-moz-focusring,\n" +
                    "[type=\"reset\"]:-moz-focusring,\n" +
                    "[type=\"submit\"]:-moz-focusring {\n" +
                    "  outline: 1px dotted ButtonText;\n" +
                    "}");
            pw.println("/**\n" +
                    " * Correct the padding in Firefox.\n" +
                    " */\n" +
                    "fieldset {\n" +
                    "  padding: 0.35em 0.75em 0.625em;\n" +
                    "}");
            pw.println("/**\n" +
                    " * 1. Correct the text wrapping in Edge and IE.\n" +
                    " * 2. Correct the color inheritance from `fieldset` elements in IE.\n" +
                    " * 3. Remove the padding so developers are not caught out when they zero out\n" +
                    " *    `fieldset` elements in all browsers.\n" +
                    " */\n" +
                    "legend {\n" +
                    "  box-sizing: border-box; /* 1 */\n" +
                    "  color: inherit; /* 2 */\n" +
                    "  display: table; /* 1 */\n" +
                    "  max-width: 100%; /* 1 */\n" +
                    "  padding: 0; /* 3 */\n" +
                    "  white-space: normal; /* 1 */\n" +
                    "}\n");
            pw.println("/**\n" +
                    " * 1. Add the correct display in IE 9-.\n" +
                    " * 2. Add the correct vertical alignment in Chrome, Firefox, and Opera.\n" +
                    " */\n" +
                    "progress {\n" +
                    "  display: inline-block; /* 1 */\n" +
                    "  vertical-align: baseline; /* 2 */\n" +
                    "}");
            pw.println("/**\n" +
                    " * Remove the default vertical scrollbar in IE.\n" +
                    " */\n" +
                    "textarea {\n" +
                    "  overflow: auto;\n" +
                    "}");
            pw.println("/**\n" +
                    " * 1. Add the correct box sizing in IE 10-.\n" +
                    " * 2. Remove the padding in IE 10-.\n" +
                    " */\n" +
                    "[type=\"checkbox\"],\n" +
                    "[type=\"radio\"] {\n" +
                    "  box-sizing: border-box; /* 1 */\n" +
                    "  padding: 0; /* 2 */\n" +
                    "}");
            pw.println("/**\n" +
                    " * Correct the cursor style of increment and decrement buttons in Chrome.\n" +
                    " */\n" +
                    "[type=\"number\"]::-webkit-inner-spin-button,\n" +
                    "[type=\"number\"]::-webkit-outer-spin-button {\n" +
                    "  height: auto;\n" +
                    "}\n");
            pw.println("/**\n" +
                    " * 1. Correct the odd appearance in Chrome and Safari.\n" +
                    " * 2. Correct the outline style in Safari.\n" +
                    " */\n" +
                    "[type=\"search\"] {\n" +
                    "  -webkit-appearance: textfield; /* 1 */\n" +
                    "  outline-offset: -2px; /* 2 */\n" +
                    "}\n");
            pw.println("/**\n" +
                    " * Remove the inner padding and cancel buttons in Chrome and Safari on macOS.\n" +
                    " */\n" +
                    "[type=\"search\"]::-webkit-search-cancel-button,\n" +
                    "[type=\"search\"]::-webkit-search-decoration {\n" +
                    "  -webkit-appearance: none;\n" +
                    "}\n");
            pw.println("/**\n" +
                    " * 1. Correct the inability to style clickable types in iOS and Safari.\n" +
                    " * 2. Change font properties to `inherit` in Safari.\n" +
                    " */\n" +
                    "::-webkit-file-upload-button {\n" +
                    "  -webkit-appearance: button; /* 1 */\n" +
                    "  font: inherit; /* 2 */\n" +
                    "}\n");
            pw.println("/* Interactive\n" +
                    "   ========================================================================== */\n");
            pw.println("/*\n" +
                    " * Add the correct display in IE 9-.\n" +
                    " * 1. Add the correct display in Edge, IE, and Firefox.\n" +
                    " */\n" +
                    "details, /* 1 */\n" +
                    "menu {\n" +
                    "  display: block;\n" +
                    "}\n");
            pw.println("/*\n" +
                    " * Add the correct display in all browsers.\n" +
                    " */\n" +
                    "summary {\n" +
                    "  display: list-item;\n" +
                    "}\n");
            pw.println("/* Scripting\n" +
                    "   ========================================================================== */\n");
            pw.println("/**\n" +
                    " * Add the correct display in IE 9-.\n" +
                    " */\n" +
                    "canvas {\n" +
                    "  display: inline-block;\n" +
                    "}\n");
            pw.println("/**\n" +
                    " * Add the correct display in IE.\n" +
                    " */\n" +
                    "template {\n" +
                    "  display: none;\n" +
                    "}\n");
            pw.println("/* Hidden\n" +
                    "   ========================================================================== */\n");
            pw.println("/**\n" +
                    " * Add the correct display in IE 10-.\n" +
                    " */\n" +
                    "[hidden] {\n" +
                    "  display: none;\n" +
                    "}");
            pw.println("");



            pw.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }


    /**
     * creates a scripts dir and js file, populated with any catchall js I am using
     * @param path
     */
    public void makeJSTemplate(String date, String path) {
        try {

            //create scripts directory and js file
            File js = new File(path + "//src//scripts//global.js");
            js.getParentFile().mkdirs();

            //populate global JS file
            PrintWriter pw = new PrintWriter(new FileOutputStream(path + "//src//scripts//global.js"));
            pw.println("");
            pw.println("console.log(\"Author: Tim Day\");");
            pw.close();

            // create libs folder
            File lib = new File(path + "//src//scripts//libs//");
            js.getParentFile().mkdirs();
            lib.getCanonicalFile().mkdir();


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
    public void makeAssetsDirectories(String path) {
        try {

            // Assets Directory - Assets/images/
            File ass = new File(path + "//src//assets//photos");
            ass.getParentFile().mkdirs();
            ass.getCanonicalFile().mkdir();

            File icons = new File(path + "//src//assets//icons");
            icons.getCanonicalFile().mkdir();

            if (ass.exists() && ass.isDirectory()){
                System.out.println("Assets and images directories created!");
            }else{
                System.out.println("Assets and images directories already exist.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     *
     * @param path
     * @param proj
     */
    public void makeGruntPackageJS(String path, String proj) {

        try {

            //populate the package.js file
            PrintWriter pw = new PrintWriter(new FileOutputStream(path + "//package.json"));
            pw.println("{");
            pw.println("\t\"name\": \"" + proj + "\",");
            pw.println("\t\"version\": \"0.1.0\",");
            pw.println("\"devDependencies\": {\n" +
                    "    \"grunt\": \"~0.4.5\",\n" +
                    "    \"grunt-contrib-concat\": \"^1.0.1\",\n" +
                    "    \"grunt-contrib-uglify\": \"~0.5.0\",\n" +
                    "    \"grunt-contrib-nodeunit\": \"~0.4.1\",\n" +
                    "    \"grunt-contrib-jshint\": \"~0.10.0\"\n" +
                    "  }");
            pw.println("}");
            pw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     *
     * @param path
     */
    public void makeGruntFile(String path) {

        try {

            //populate the Gruntfile.js
            PrintWriter pw2 = new PrintWriter(new FileOutputStream(path + "//Gruntfile.js"));

            pw2.println("module.exports = function(grunt) {");
            pw2.println("\n  grunt.initConfig({\n" +
                    "    pkg: grunt.file.readJSON('package.json'),\n");

            pw2.println("//  Generate the build directories\n" +
                    "    mkdir: {\n" +
                    "      dev: {\n" +
                    "        options: {\n" +
                    "          create: ['build/','build/styles/','build/scripts/','build/assets_build/photos_build/','build/assets_build/icons_build/']\n" +
                    "        },\n" +
                    "      },\n" +
                    "    },\n");

            pw2.println("//  minimise html files\n" +
                    "    htmlmin: {\n" +
                    "      dist: {\n" +
                    "        options: {\n" +
                    "          removeComments: true,\n" +
                    "          collapseWhitespace: true\n" +
                    "        },\n" +
                    "        files: {\n" +
                    "          'build/index.html': 'src/index.html', // destination : src\n" +
                    "          'build/contact.html': 'src/contact.html'\n" +
                    "        }\n" +
                    "      },\n" +
                    "    },\n");

            pw2.println("//  concat css files\n" +
                    "    concat: {\n" +
                    "        dist: {\n" +
                    "            src: [\n" +
                    "            'src/styles/normalize.css',\n" +
                    "            'src/styles/global.css'\n" +
                    "        ],\n" +
                    "        dest: 'src/styles/production.css',\n" +
                    "        }\n" +
                    "    },\n");

            pw2.println("//  minimise css files\n" +
                    "    cssmin: {\n" +
                    "      target: {\n" +
                    "        files: [{\n" +
                    "          expand: true,\n" +
                    "          cwd: 'src/styles',\n" +
                    "          src: ['production.css', '!*.min.css'],\n" +
                    "          dest: 'build/styles/',\n" +
                    "          ext: '.min.css'\n" +
                    "        }]\n" +
                    "      }\n" +
                    "    },\n");

            pw2.println("//  concat and minify to production.js\n" +
                    "    uglify: {\n" +
                    "        my_target: {\n" +
                    "          files: {\n" +
                    "            'build/scripts/production.min.js': ['src/scripts/libs/*.js','src/scripts/global.js']\n" +
                    "          }\n" +
                    "        }\n" +
                    "    },\n");

            pw2.println("//  shrink and compress images. Change params as needed\n" +
                    "//  update HTML img srcs with new img names\n" +
                    "//  make sure graphics Magick is installed\n" +
                    "    responsive_images: {\n" +
                    "      dev: {\n" +
                    "        options: {\n" +
                    "          engine: 'gm',\n" +
                    "          sizes: [{\n" +
                    "            width: 400,\n" +
                    "            suffix: '_A',\n" +
                    "            quality: 30\n" +
                    "          },{\n" +
                    "            width: 800,\n" +
                    "            suffix: '_B',\n" +
                    "            quality: 50\n" +
                    "          }]\n" +
                    "        },\n" +
                    "        \n" +
                    "        files: [{\n" +
                    "          expand: true,\n" +
                    "          src: ['*.{jpg,gif,png}'],\n" +
                    "          cwd: 'src/assets/photos/',\n" +
                    "          dest: 'build/assets_build/photos_build'\n" +
                    "        }]\n" +
                    "      }\n" +
                    "    },\n");

            pw2.println("//  Clear out the build assets directory if it exists\n" +
                    "    clean: {\n" +
                    "      dev: {\n" +
                    "        src: ['build/assets_build/'],\n" +
                    "      },\n" +
                    "    },\n");

            pw2.println("//  Copy the icon images that don't go through processing into the build directory\n" +
                    "    copy: {\n" +
                    "      dev: {\n" +
                    "        files: [{\n" +
                    "          expand: true,\n" +
                    "          cwd: 'src/assets/icons/',\n" +
                    "          src: '*.{gif,jpg,png}',\n" +
                    "          dest: 'build/assets_build/icons_build'\n" +
                    "        }]\n" +
                    "      },\n" +
                    "    },\n");

            pw2.println("  }); //end config"); // end plug in config


            pw2.println("\n// tell Grunt we plan to use this plug-in.\n" +
                    "  grunt.loadNpmTasks('grunt-contrib-concat');\n" +
                    "  grunt.loadNpmTasks('grunt-contrib-uglify');\n" +
                    "  grunt.loadNpmTasks('grunt-contrib-htmlmin');\n" +
                    "  grunt.loadNpmTasks('grunt-contrib-cssmin');\n" +
                    "  grunt.loadNpmTasks('grunt-contrib-clean');\n" +
                    "  grunt.loadNpmTasks('grunt-mkdir');\n" +
                    "  grunt.loadNpmTasks('grunt-contrib-copy');\n" +
                    "  grunt.loadNpmTasks('grunt-responsive-images');");

            pw2.println("\n// tell Grunt excution order when \"grunt\" in terminal.\n" +
                    "  grunt.registerTask('default', ['mkdir','concat','uglify','htmlmin','cssmin','clean','copy','responsive_images']);");
            pw2.println("};"); //end file
            pw2.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     *
     * @param path
     */
    public void makeGruntReadme(String path){
        try {
            //populate the Readme-grunt.txt
            PrintWriter pw = new PrintWriter(new FileOutputStream(path + "//Readme-grunt.txt"));

            pw.println("Grunt Instructions Readme\n" +
                    "\n" +
                    "https://gruntjs.com/getting-started\n" +
                    "\n" +
                    "- grunt must be installed on a per-project basis\n" +
                    "- you will need a package.json file in the root dir of the project\n" +
                    "- you will need a Gruntfile.js file in the root dir of the project\n" +
                    "- for the responsive img plug in, graphics magick must be installed\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "—— Terminal Commands to Install Plugins — — \n" +
                    "npm install\n" +
                    "npm install grunt --save-dev\n" +
                    "npm install grunt-mkdir --save-dev\n" +
                    "npm install grunt-contrib-concat --save-dev\n" +
                    "npm install grunt-contrib-uglify --save-dev\n" +
                    "npm install grunt-contrib-cssmin --save-dev\n" +
                    "npm install grunt-responsive-images --save-dev\n" +
                    "npm install grunt-contrib-clean --save-dev\n" +
                    "npm install grunt-contrib-copy --save-dev\n" +
                    "npm install grunt-contrib-htmlmin --save-dev\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "https://github.com/gruntjs/grunt-contrib-concat\n" +
                    "https://github.com/gruntjs/grunt-contrib-uglify\n" +
                    "\n" +
                    "https://www.npmjs.com/package/grunt-contrib-cssmin\n" +
                    "https://github.com/andismith/grunt-responsive-images\n" +
                    "https://github.com/gruntjs/grunt-contrib-clean\n" +
                    "https://www.npmjs.com/package/grunt-mkdir\n" +
                    "https://github.com/gruntjs/grunt-contrib-copy\n" +
                    "\n" +
                    "helpful guides\n" +
                    "https://addyosmani.com/blog/generate-multi-resolution-images-for-srcset-with-grunt/\n" +
                    "\n\n");
            pw.close();

            } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    // GitHub Files - README and LICENSE (empty)
    public void makeGitHubFiles(String date, String path, String proj) {

        try {
            // create files
            File l = new File(path + "//LICENSE");
            File rm = new File(path + "//README.md");
            File ig = new File(path + "//.gitignore");

            //populate files
            PrintWriter pw = new PrintWriter(new FileOutputStream(path + "//README.md"));
            pw.println("# " + proj);
            pw.close();

            PrintWriter pw2 = new PrintWriter(new FileOutputStream(path + "//LICENSE"));
            pw2.println("https://choosealicense.com/");
            pw2.println("Current License: No License");
            pw2.close();

            PrintWriter pw3 = new PrintWriter(new FileOutputStream(path + "//.gitignore"));
            pw3.println("# https://git-scm.com/docs/gitignore");
            pw3.println("# https://help.github.com/articles/ignoring-files");
            pw3.println("# Example .gitignore files: https://github.com/github/gitignore");
            pw3.println("/bower_components/");
            pw3.println("/node_modules/");
            pw3.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {

        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = new Date();
        String date = sdf.format(d);

        String path = System.getProperty("user.home") + "/Desktop/" + args[0];

        System.out.println(System.getProperty("user.home"));


        if (args.length == 1) {

            String proj = args[0];
            System.out.println("project name input: " + proj);

            System.out.println("----------------------");

            WebDevSkeleton creator = new WebDevSkeleton();

            System.out.println(creator);
            creator.makeHTMLTemplate(date, path, proj);
            creator.makeCSSTemplate(date, path, proj);
            creator.makeJSTemplate(date, path);
            creator.makeAssetsDirectories(path);
            creator.makeNormalizeCSSFile(path);
            creator.makeGruntPackageJS(path, proj);
            creator.makeGruntFile(path);
            creator.makeGruntReadme(path);
            creator.makeGitHubFiles(date, path, proj);


            System.out.println("----------------------");

        } else {
            System.out.println("enter your file name as an argument");

        }
    } //main


}

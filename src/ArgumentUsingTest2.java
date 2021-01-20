import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class ArgumentUsingTest2 {
    /*
    ant [options] [target [target2 [target3] ...]]
      Options:
      -help                 print this message
      -projecthelp          print project help information
      -version              print the version information and exit
      -quiet                be extra quiet
      -verbose              be extra verbose
      -debug                print debugging information
      -emacs                produce logging information without adornments
      -logfile              use given file for log
      -logger               the class which is to perform logging
      -listener             add an instance of class as a project listener
      -buildfile            use given buildfile
      -D=                   use value for given property
      -find                 search for buildfile towards the root of the filesystem and use it
     */

    public static void main(String[] args) {
        // 1. Boolean 옵션. 헬프 출력
        //args = new String[] { "-h" };
        //args = new String[] { "--help" };

        // 2. Argument 옵션. 빌드 파일 출력
        //args = new String[] { "-buildfile", "ant.xml" };

        // 3. Java Property 옵션.
        //args = new String[]{"-D", "k1=v1"};


        // Options 객체 생성
        Options options = new Options();

        // all 옵션 추가
        options.addOption("all", false, "모든 id에 대해 수행");
        // part 옵션 추가
        options.addOption("part", true, "특정 id에 대해 수행");
        // miss 옵션 추가
        options.addOption("miss", true, "누락된 id에 대해 수행");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            String countryCode = cmd.getOptionValue("c");

            // all일 경우
            if (cmd.hasOption("all")) {
                System.out.println("Option t: " + calendar.getTime());
            }
            // part일 경우
            if (cmd.hasOption("part")) {
                System.out.println(calendar.getTime());
            }

        } catch (ParseException e) {
            System.err.println("Parsing failed. Reason: " + e.getMessage());
        }


        // Boolean 옵션
        /*
        Option help = new Option("h", "help", false, "print this message");
        Option projecthelp = new Option("projecthelp", "print project help information");
        Option version = new Option("version", "print the version information and exit");
        Option quiet = new Option("quiet", "be extra quiet");
        Option verbose = new Option("verbose", "be extra verbose");
        Option debug = new Option("debug", "print debugging information");
        Option emacs = new Option("emacs", "produce logging information without adornments");

        // Argument 옵션
        Option logfile = Option.builder("logfile").argName("file").hasArg().desc("use given file for log").build();
        Option logger = Option.builder("logger").argName("classname").hasArg().desc("the class which it to perform " + "logging").build();
        Option listener = Option.builder("listener").argName("classname").hasArg().desc("add an instance of class as " + "a project listener").build();
        Option buildfile = Option.builder("buildfile").argName("file").hasArg().desc("use given buildfile").build();
        Option find = Option.builder("find").argName("file").hasArg().desc("search for buildfile towards the " + "root of the filesystem and use it").build();

        // Java Property 옵션
        Option property = Option.builder("D").argName("property=value").numberOfArgs(2).valueSeparator().desc("use value for given property").build();

        // Options 생성
        Options options = new Options();
        options.addOption(help);
        options.addOption(projecthelp);
        options.addOption(version);
        options.addOption(quiet);
        options.addOption(verbose);
        options.addOption(debug);
        options.addOption(emacs);
        options.addOption(logfile);
        options.addOption(logger);
        options.addOption(listener);
        options.addOption(buildfile);
        options.addOption(find);
        options.addOption(property);

        // 파서 생성
        CommandLineParser parser = new DefaultParser();
        try {
            // 커맨드 라인 입력 분석
            CommandLine line = parser.parse(options, args);
            if (line.hasOption("help")) {
                // Help문 자동 생성
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("ant", options);
            }
            // buidlfile 옵션을 가지고 있는지 확인
            if (line.hasOption("buildfile")) {
                // 옵션 값을 반환
                String bfile = line.getOptionValue("buildfile");
                System.out.printf("buildfile: ", bfile);
            }
            if (line.hasOption("D")) {
                Properties prop = line.getOptionProperties("D");
                System.out.println(prop.getProperty("k1", "기본값1"));
                System.out.println(prop.getProperty("k2", "기본값2"));
            }
        } catch (ParseException exp) {
            System.err.println("Parsing failed. Reason: " + exp.getMessage());
        }

         */
    }

}
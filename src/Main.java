/**
 * Created by sebb on 10/15/15.
 */
public class Main {

    public static void main(String[] args) {
        Application app = new Application();
        Tausch t = new Tausch();

        CmdParser cmdp = new CmdParser();

        for(String arg : args)
        {
            cmdp.add(() -> { app.print(); }, "print", "p");
            cmd.add(() ->  app.math(), "math", "m");
            //else if(arg.equals("-pm") || arg.equals("-mp"))
                //print = math = true;
            else if(arg.equals("-t") || arg.equals("--tausch"))
                tausch = true;
            else if(arg.equals("-r") || arg.equals("--radius"))
                radius = true;
            else if(arg.equals("-k") || arg.equals("--kugel"))
                kugel = true;
            else if(arg.equals("-i") || arg.equals("--sonstwas"))
                irgendwiemathe = true;
            else if(arg.equals("-d") || arg.equals("--datum"))
                datum = true;
            else if (!arg.equals(args[0]))
                System.out.println("Unknown arg: "+arg);
        }

        if(print)
            app.print();
        if(math)

        if(tausch)
        {

            t.tausch();
        }
        if (radius)
            app.radius(Math.E);
        if(kugel)
            app.kugel(Math.E);
        if(irgendwiemathe)
            app.IrgendeineGleichung(42, 11);
        if(datum)
            app.Datumszeug();

        if(!math && !print && !tausch)
            System.out.println("Usage: " + args[0] + " -m|--math -p|--print -t|--tausch");
    }
}

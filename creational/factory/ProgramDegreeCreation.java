package creational.factory;

public class ProgramDegreeCreation {
    public static void main(String[] args) {

        //Creating Undergraduate Program factory
        ProgramFactory UndergraduateProgramFactory = new UndergraduateProgramFactory();
        //Creating BSCS Program using the Undergraduate program factory
        System.out.print("\nPlease select your degree major: BSCS\n");
        String degreeMajor = "BSCS";
        Programs BSCSProgram = UndergraduateProgramFactory.createProgram(degreeMajor);
        System.out.println(BSCSProgram.getDescription());
        System.out.println(BSCSProgram.getDuration());

        //Creating BSCIS Program using the Undergraduate program factory
        System.out.print("\nPlease select your degree major: BSCIS\n");
        String degreeMajor2= "BSCIS";
        Programs BSCISProgram = UndergraduateProgramFactory.createProgram(degreeMajor2);
        System.out.println(BSCISProgram.getDescription());
        System.out.println(BSCISProgram.getDuration());

        //Creating Graduate Program factory
        ProgramFactory GraduateProgramFactory = new GraduateProgramFactory();
        //Creating MSCS Program using the Graduate program factory
        System.out.print("\nPlease select your degree major: MSCS\n");
        String degreeMajor3= "MSCS";
        Programs MSCSProgram = GraduateProgramFactory.createProgram(degreeMajor3);
        System.out.println(MSCSProgram.getDescription());
        System.out.println(MSCSProgram.getDuration());

        //Creating MSCIS Program using the Graduate program factory
        System.out.print("\nPlease select your degree major: MSCIS\n");
        String degreeMajor4= "MSCIS";
        Programs MSCISProgram = GraduateProgramFactory.createProgram(degreeMajor3);
        System.out.println(MSCISProgram.getDescription());
        System.out.println(MSCISProgram.getDuration());

        //Creating MSDA Program factory using the Graduate program factory
        System.out.print("\nPlease select your degree major: MSDA\n");
        String degreeMajor5= "MSDA";
        Programs MSDAProgram = GraduateProgramFactory.createProgram(degreeMajor5);
        System.out.println(MSDAProgram.getDescription());
        System.out.println(MSDAProgram.getDuration());

        //Creating Certificate Program factory
        ProgramFactory CertificateProgramFactory = new CertificateProgramFactory();
        //Creating Security Certificate Program using the certificate program factory
        System.out.print("\nPlease select your degree major: Security Certificate\n");
        String degreeMajor6= "Security";
        Programs SecurityCertificateProgram = CertificateProgramFactory.createProgram(degreeMajor6);
        System.out.println(SecurityCertificateProgram.getDescription());
        System.out.println(SecurityCertificateProgram.getDuration());

        //Creating Web Tech Certificate program using the certificate program factory
        System.out.print("\nPlease select your degree major: WebTech Certificate\n");
        String degreeMajor7= "WebTech";
        Programs WebTechCertificateProgram = CertificateProgramFactory.createProgram(degreeMajor7);
        System.out.println(WebTechCertificateProgram.getDescription());
        System.out.println(WebTechCertificateProgram.getDuration());

        //Creating Analytics Certificate Program using the certificate program factory
        System.out.print("\nPlease select your degree major: Analytics Certificate\n");
        String degreeMajor8= "Analytics";
        Programs AnalyticsCertificateProgram = CertificateProgramFactory.createProgram(degreeMajor8);
        System.out.println(AnalyticsCertificateProgram.getDescription());
        System.out.println(AnalyticsCertificateProgram.getDuration());

    }
}

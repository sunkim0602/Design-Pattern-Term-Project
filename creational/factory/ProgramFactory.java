package creational.factory;

abstract class ProgramFactory {
    public abstract Programs createProgram(String degreeSelected);
}

//Each factory returns the appropriate program based on the degree selected by the student
class UndergraduateProgramFactory extends ProgramFactory {
    public Programs createProgram(String degreeSelected) {
        if (degreeSelected.equalsIgnoreCase("BSCS")) {
            return new BSCSProgram();
        } else if (degreeSelected.equalsIgnoreCase("BSCIS")) {
            return new BSCISProgram();
        }
        return null;
    }

}
class GraduateProgramFactory extends ProgramFactory {
    public Programs createProgram(String degreeSelected) {
        if (degreeSelected.equalsIgnoreCase("MSCS")) {
            return new MSCSProgram();
        } else if (degreeSelected.equalsIgnoreCase("MSCIS")) {
            return new MSCISProgram();
        } else if (degreeSelected.equalsIgnoreCase("MSDA")) {
            return new MSDAProgram();
        }
        return null;
    }
}
class CertificateProgramFactory extends ProgramFactory {
    public Programs createProgram(String degreeSelected) {
        if (degreeSelected.equalsIgnoreCase("Security")) {
            return new SecurityCertificateProgram();
        } else if (degreeSelected.equalsIgnoreCase("WebTech")) {
            return new WebTechCertificateProgram();
        } else if (degreeSelected.equalsIgnoreCase("Analytics")) {
            return new AnalyticsCertificateProgram();
        }
        return null;
    }
}


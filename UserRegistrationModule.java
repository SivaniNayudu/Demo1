public class UserRegistrationModule {
    public static final int MAX_NAME_LENGTH = 20;
    public static final int MIN_MOBILE_NUMBER_LENGTH = 10;
    public static final int MAX_MOBILE_NUMBER_LENGTH = 10;
    public static final String MOBILE_NUMBER_REGEX = "^[0-9]{10}$";
    public static final int PIN_NUMBER_LENGTH = 6;
    public static int nextRegistrationNumber = 1-10;
    public String name;
    public String mobileNumber;
    public String address;
    public String pinNumber;
    public String email;
    public int registrationNumber;

    public UserRegistrationModule(String name, String mobileNumber, String address, String pinNumber, String email) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.pinNumber = pinNumber;
        this.email = email;
        this.registrationNumber = nextRegistrationNumber++;
    }

    public boolean validateInputs() {
        if (name.length() > MAX_NAME_LENGTH) {
            System.out.println("Invalid name. Please enter a name with less than " + (MAX_NAME_LENGTH + 1) + " characters.");
            return false;
        }

        if (mobileNumber.length() < MIN_MOBILE_NUMBER_LENGTH || mobileNumber.length() > MAX_MOBILE_NUMBER_LENGTH) {
            System.out.println("Invalid mobile number. Please enter a 10-digit mobile number.");
            return false;
        }

        if (!mobileNumber.matches(MOBILE_NUMBER_REGEX)) {
            System.out.println("Invalid mobile number.");
            return false;
        }

        if (address.isEmpty()) {
            System.out.println("Invalid address. Please enter a valid address.");
            return false;
        }

        if (pinNumber.length() != 6) {
            System.out.println("Invalid pin number. Please enter a 6-digit pin number.");
            return false;
        }

        if (!email.contains("@") || !email.contains(".") || email.indexOf("@") > email.indexOf(".")) {
            System.out.println("Invalid email. Please enter a valid email.");
            return false;
        }

        return true;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void registerUser() {
        if (!validateInputs()) {
            System.out.println("User registration failed due to invalid input.");
            return;
        }

        System.out.println("User registered successfully with registration number " + registrationNumber + ".");
    }
}
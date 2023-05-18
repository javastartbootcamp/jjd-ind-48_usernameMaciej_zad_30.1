package pl.javastart.validationtask;

import jakarta.validation.constraints.*;

public class RegisterFormDto {

    @NotBlank(message = "Imię nie może być puste")
    @Min(value = 3, message = "Imię musi mieć minimum 3 znaki")
    private String firstName;

    @NotBlank(message = "Nazwisko nie może być puste")
    @Min(value = 3, message = "Nazwisko musi mieć minimum 3 znaki")
    private String surname;

    @NotBlank(message = "Adres nie może być pusty")
    private String address;

    @NotBlank(message = "Kod pocztowy nie może być pusty")
    @Pattern(regexp = "[0-9]{5}", message = "Kod pocztowy musi wyglądać w taki sposób \"12-345\"")
    private String postalCode;

    @NotBlank(message = "Miasto nie może być puste")
    private String city;

    @NotNull(message = "Email nie może być pusty")
    @Email(message = "Wpisz prawidłowy e-mail")
    @Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", message = "Wpisz prawidłowy e-mail")
    private String email;

    @NotNull(message = "Hasło nie może być puste")
    @Min(value = 8, message = "Hasło musi zawierać minimum 8 znaków")
    @Pattern(regexp = "[a-zA-Z0-9]*", message = "Hasło musi zawierać min 1 duży znak, 1 mały, 1 znak specjalny")
    private String password;

    @AssertTrue(message = "Akceptacja regulaminu jest wymagana")
    private boolean termsAgreement;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTermsAgreement() {
        return termsAgreement;
    }

    public void setTermsAgreement(boolean termsAgreement) {
        this.termsAgreement = termsAgreement;
    }
}

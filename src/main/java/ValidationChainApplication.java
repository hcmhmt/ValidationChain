import config.ValidationChain;
import context.UserControlContext;
import context.ValidationResult;
import validation.EmailValidationClass;
import validation.NameValidationClass;

public class ValidationChainApplication {

    public static void main(String[] args) {

        UserControlContext userControlContext = new UserControlContext();
        userControlContext.setUsername("username");
        userControlContext.setEmail("email");

        ValidationResult validationResult = new ValidationChain()
                .chainWith(new EmailValidationClass())
                .chainWith(new NameValidationClass())
                .execute(userControlContext);

        if(!validationResult.isResultSuccess()){
            System.out.println(validationResult.getMessage());
        }

    }

}

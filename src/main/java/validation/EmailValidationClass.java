package validation;

import context.UserControlContext;
import context.ValidationResult;

public class EmailValidationClass extends AbstractValidationChain<UserControlContext> {

    @Override
    public ValidationResult execute(UserControlContext context) {
        System.out.println("validation.EmailValidationClass");
        return ValidationResult.Builder.getBuilder()
                .isResultSuccess(false)
                .withMessage("Email Validation is not valid!")
                .build();
    }
}

package validation;

import context.UserControlContext;
import context.ValidationResult;
import service.IUserControlService;

public class EmailValidationClass implements IUserControlService<UserControlContext> {

    @Override
    public ValidationResult validate(UserControlContext context) {
        System.out.println("validation.EmailValidationClass");
        return ValidationResult.Builder.getBuilder()
                .isResultSuccess(false)
                .withMessage("Email Validation is not valid!")
                .build();
    }
}

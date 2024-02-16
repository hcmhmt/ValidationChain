package validation;

import context.UserControlContext;
import context.ValidationResult;
import service.IUserControlService;

public class NameValidationClass implements IUserControlService<UserControlContext> {

    @Override
    public ValidationResult validate(UserControlContext context) {
        System.out.println("validation.NameValidationClass");
        return ValidationResult.Builder.getBuilder().isResultSuccess(true).build();
    }
}

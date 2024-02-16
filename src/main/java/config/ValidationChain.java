package config;

import context.AbstractValidationContext;
import context.ValidationResult;
import service.IUserControlService;

import java.util.ArrayList;
import java.util.List;

public class ValidationChain<T extends AbstractValidationContext> {
    private List<IUserControlService> validationChainList = new ArrayList<>();

    public ValidationChain chainWith(IUserControlService newValidation){
        if(validationChainList == null){
            validationChainList = new ArrayList<>();
        }
        validationChainList.add(newValidation);
        return this;
    }

    public ValidationResult execute(T validationContext){
        for (IUserControlService validationChain : validationChainList) {
            ValidationResult validationResult = validationChain.validate(validationContext);
            if (!validationResult.isResultSuccess()) {
                return validationResult;
            }
        }

        return ValidationResult.Builder
                .getBuilder()
                .isResultSuccess(true)
                .build();
    }
}

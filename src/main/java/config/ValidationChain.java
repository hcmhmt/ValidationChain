package config;

import context.AbstractValidationContext;
import context.ValidationResult;
import validation.AbstractValidationChain;

import java.util.ArrayList;
import java.util.List;

public class ValidationChain<T extends AbstractValidationContext> {
    private List<AbstractValidationChain> validationChainList = new ArrayList<>();

    public ValidationChain chainWith(AbstractValidationChain newValidation) {
        if (validationChainList == null) {
            validationChainList = new ArrayList<>();
        }
        validationChainList.add(newValidation);
        return this;
    }

    public ValidationResult execute(T validationContext) {
        for (AbstractValidationChain validationChain : validationChainList) {
            ValidationResult validationResult = validationChain.execute(validationContext);
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

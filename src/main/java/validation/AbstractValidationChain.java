package validation;

import context.AbstractValidationContext;
import context.ValidationResult;

public abstract class AbstractValidationChain<T extends AbstractValidationContext> {

    public abstract ValidationResult execute(T t);

}

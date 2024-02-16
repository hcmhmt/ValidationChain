package service;

import context.AbstractValidationContext;
import context.ValidationResult;

public interface IUserControlService<T extends AbstractValidationContext> {

    ValidationResult validate(T context);

}

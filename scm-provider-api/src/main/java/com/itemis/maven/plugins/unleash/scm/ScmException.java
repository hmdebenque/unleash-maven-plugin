package com.itemis.maven.plugins.unleash.scm;

public class ScmException extends Exception {
  private static final long serialVersionUID = -8864350557327681422L;

  private ScmOperation operation;

  public ScmException(ScmOperation operation, String message) {
    super(message);
    this.operation = operation;
  }

  public ScmException(ScmOperation operation, String message, Throwable cause) {
    super(message, cause);
    this.operation = operation;
  }

  public ScmOperation getOperation() {
    return this.operation;
  }
}

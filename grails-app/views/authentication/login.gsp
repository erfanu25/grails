<meta name="layout" content="main"/>

                        <g:form controller="authentication" action="doLogin" class="form-signin">
                            <g:textField name="email" class="form-control" placeholder="Email" required="required" />
                            <g:passwordField name="password" class="form-control" placeholder="Password" required="required" />
                            <g:submitButton class="btn btn-lg btn-primary btn-block" name="login" value="Login"/>
                        </g:form>

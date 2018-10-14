<meta name="layout" content="main" />
<div class="card">
  <div class="card-header">
    <label>List</label>
  </div>
  <div class="card-body">
    <g:form controller="list" action="doCreate">
        <g:render template="form"/>
        <div class="form-action-panel">
            <g:submitButton name="login" value="Save" class="btn btn-primary" />
            <g:link controller="list" action="index" class="btn btn-primary">Cancel</g:link>

        </div>
    </g:form>
  </div>
</div>

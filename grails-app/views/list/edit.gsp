<meta name="layout" content="main" />

<div class="card-header">
    <label>List</label>
</div>
<div class="card-body">
    <g:form controller="list" action="update">
        <g:hiddenField name="id" value="${list.id}"/>
        <g:render template="form"/>
        <div class="form-action-panel">
            <g:submitButton name="login" value="Update" class="btn btn-primary"/>
            <g:link controller="list" action="index" class="btn btn-primary">Cancel</g:link>
        </div>
    </g:form>
</div>

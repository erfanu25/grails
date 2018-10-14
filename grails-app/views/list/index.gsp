
        <meta name="layout" content="main" />


        <div id="list-list" class="content scaffold-list" role="main">
            <div class="btn-group">
            <table>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Age</th>
                    <th>Phone</th>
                    <th>Edit</th>
                </tr>
                <g:each in="${list}" var="info">

                        <tr>
                            <td>${info?.name}</td>
                            <td>${info?.email}</td>
                            <td>${info?.age}</td>
                            <td>${info?.phone}</td>
                            <td>
                                <div class="btn-group">
                                    <g:link controller="list" action="edit" class="btn btn-secondary" id="${info.id}"><g:message code="default.button.edit.label" /> </g:link>
                                    <g:link controller="list" action="delete" class="btn btn-secondary delete-confirmation" id="${info.id}"><g:message code="default.button.delete.label" /> </g:link>
                                </div>
                            </td>
                        </tr>

                </g:each>
            </table>
            </div>
        </div>

        <g:link controller="list" action="create" class="btn btn-primary"><g:message code="default.button.create.label" /> </g:link>



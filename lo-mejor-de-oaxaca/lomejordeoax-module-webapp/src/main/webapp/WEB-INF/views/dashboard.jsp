<%@ include file="/WEB-INF/views/include.jsp" %>
<h3>
   <!-- START Language list-->
   <div class="pull-right">
      <div uib-dropdown="" is-open="language.listIsOpen" class="btn-group">
         <button type="button" uib-dropdown-toggle="" class="btn btn-default">{{language.selected}}
            <span class="caret"></span>
         </button>
         <ul role="menu" class="dropdown-menu dropdown-menu-right animated fadeInUpShort">
            <li ng-repeat="(localeId, langName) in language.available"><a ng-click="language.set(localeId, $event)" href="#">{{langName}}</a>
            </li>
         </ul>
      </div>
   </div>
   <!-- END Language list    -->
   Dashboard
   <small>{{ 'dashboard.WELCOME' | translate:{ appName: app.name } }} !</small>
</h3>
<h1>Dashboard Content HERE</h1>
<p>Greetings, it is now <c:out value="${now}"/></p>
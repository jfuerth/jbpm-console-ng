
<h2>${task.names[0].text}</h2>
<hr>
<#if task.descriptions[0]??>
Description: ${task.descriptions[0].text}
</#if>

<form>
<input type="hidden" name="taskId" value="${task.id}"/>
<table>
    <tr><td colspan="2"><br/><br/>Inputs</td></tr>
<#list inputs?keys as key>
    <#assign value = inputs[key]>
    
    
    <tr><td>${key} : </td><td> <input type="text" name="${key}" value="${value}"/> </td></tr>
</#list>

<tr><td colspan="2"><br/><br/>Outputs</td></tr>
<#list outputs?keys as key>
    <#assign value = outputs[key]>

    <tr><td>${value} : </td><td> <input type="text" name="${value}" value=""/> </td></tr>
</#list>
<tr><td colspan="2" align="center"><br/><br/>
<input type="button" name="btn_Start" value="Start" onClick="startTask(getFormValues(form));"/>
<input type="button" name="btn_Complete" value="Complete" onClick="completeTask(getFormValues(form));"/>

</td></tr>
</table>
</form>

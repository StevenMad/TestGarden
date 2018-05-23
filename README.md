# TestGarden

To add a template in eclipse:
Go to Window > Preferences > Java > Editor > Templates and create or edit one template
```
@${testType:newType(org.junit.Test)}
public void ${unit}_${scenario}_${expectation}(){
${a:importStatic('org.junit.Assert.*')}${m:importStatic('org.hamcrest.CoreMatchers.*')}${cursor}}
```

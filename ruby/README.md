## run tests on every save
`./run_tests_on_save`

## run tests
`bundle exec rspec`

## references
https://www.tddfellow.com/blog/2016/08/30/getting-stuck-while-doing-tdd-part-1-example/

## notes

`gem install bundler`

```
bundle
bundle exec rspec
```

or 

```
gem install rspec
rspec
```

The script to run the tests automatically relies on `watchman`. It would be probably better to rely on some tool from the `ruby` ecosystem.
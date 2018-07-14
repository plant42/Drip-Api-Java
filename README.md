# Drip API
This repository contains a Java-based client library for the Drip.com API

The API breaks down into self-contained operations covering:

- Accounts
- Broadcasts
- Campaigns
- Conversions
- Custom Fields
- Events
- Forms
- Orders
- Subscribers
- Tags
- User
- Webhooks
- Workflows

### API Token

Set the Drip API Token as such:

    DripServiceProvider.getApi().setToken(<DRIP API TOKEN>);

### Obtaining Operations

To obtain the operations for Subscribers, call the following:

    DripServiceProvider.getApi().getSubscriberOperations();


    
## Resources
**Drip API**:  [http://developer.drip.com/?shell#introduction](Drip Introduction)
